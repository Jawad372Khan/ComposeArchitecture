package com.example.composearchitecture.ui.presentation.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.composearchitecture.ui.presentation.extensions.collectOnVmScope
import com.example.composearchitecture.ui.presentation.extensions.emitOnVmScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

abstract class BaseViewModel<S : BaseState, I : BaseIntent, E : BaseEffect>(
    state: S
) : ViewModel() {

    private var _isLoading: MutableState<Boolean> = mutableStateOf(false)
    val isLoading: State<Boolean> get() = _isLoading

    private var _uiState: MutableState<S> = mutableStateOf(state)
    val uiState: State<S> get() = _uiState

    protected val currentState: S get() = uiState.value

    private val _intent: MutableSharedFlow<I> = MutableSharedFlow()
    private val intent = _intent.asSharedFlow()

    private val _effect: MutableSharedFlow<E> = MutableSharedFlow()
    val effect = _effect.asSharedFlow()

    private val _commonEffect: MutableSharedFlow<CommonEffect> = MutableSharedFlow()
    val commonEffect = _commonEffect.asSharedFlow()

    init {
        collectIntents()
    }

    private fun collectIntents() {
        intent.collectOnVmScope(this) {
            handleIntent(it)
        }
    }

    protected fun setEffect(effect: E) {
        _effect.emitOnVmScope(this, effect)
    }

    protected fun setState(reduce: S.() -> S) {
        _uiState.value = currentState.reduce()
    }

    protected abstract suspend fun handleIntent(intent: I)

    fun onIntent(intent: I) {
        _intent.emitOnVmScope(this, intent)
    }

    fun showLoader() {
        _isLoading.value = true
    }

    fun hideLoader() {
        _isLoading.value = false
    }

    suspend fun sendSessionTimeout() {
        _commonEffect.emit(CommonEffect.SessionTimeout)
    }

    suspend fun sendError(error: String) {
        _commonEffect.emit(CommonEffect.ErrorMessage(error))
    }

    suspend fun sendError(error: Int) {
        _commonEffect.emit(CommonEffect.ResErrorMessage(error))
    }

    suspend fun sendSuccess(message: String) {
        _commonEffect.emit(CommonEffect.SuccessMessage(message))
    }

    suspend fun sendSuccess(message: Int) {
        _commonEffect.emit(CommonEffect.ResSuccessMessage(message))
    }
}