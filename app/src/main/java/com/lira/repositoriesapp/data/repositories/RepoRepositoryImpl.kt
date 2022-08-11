package com.lira.repositoriesapp.data.repositories

import com.lira.repositoriesapp.core.RemoteException
import com.lira.repositoriesapp.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService): RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (e: HttpException) {
            throw RemoteException(e.message ?: "Não foi possível fazer a busca no momento!")
        }

    }
}