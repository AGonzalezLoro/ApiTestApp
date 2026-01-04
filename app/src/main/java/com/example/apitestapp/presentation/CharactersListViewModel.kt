package com.example.apitestapp.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.example.apitestapp.data.CharactersRepository
import com.example.apitestapp.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class CharactersListViewModel @Inject constructor(charactersRepository: CharactersRepository):
ViewModel() {
    val characters: Flow<PagingData<CharacterModel>> = charactersRepository.getAllCharacters()
}