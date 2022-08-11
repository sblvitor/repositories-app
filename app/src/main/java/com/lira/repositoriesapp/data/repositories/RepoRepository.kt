package com.lira.repositoriesapp.data.repositories

import com.lira.repositoriesapp.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}