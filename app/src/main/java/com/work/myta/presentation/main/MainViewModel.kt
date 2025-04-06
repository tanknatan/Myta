package com.work.myta.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.work.myta.domain.entity.AuthState
import com.work.myta.domain.repository.AppRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val authRepository: AppRepository
) : ViewModel() {

    private val _authState = MutableStateFlow<AuthState>(AuthState.Initial)
    val authState: StateFlow<AuthState> = _authState

    fun checkAuthState() {
        viewModelScope.launch {
            _authState.value = authRepository.getAuthState()
        }
    }

    fun performAuthResult() {
        viewModelScope.launch {
            authRepository.performAuthResult()
            _authState.value = authRepository.getAuthState()
        }
    }
}