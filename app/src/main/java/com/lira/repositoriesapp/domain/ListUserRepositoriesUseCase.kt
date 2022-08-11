package com.lira.repositoriesapp.domain

import com.lira.repositoriesapp.core.UseCase
import com.lira.repositoriesapp.data.model.Repo
import com.lira.repositoriesapp.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository): UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}