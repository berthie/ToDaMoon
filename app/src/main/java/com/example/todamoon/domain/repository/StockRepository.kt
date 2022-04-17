package com.example.todamoon.domain.repository

import com.example.todamoon.domain.model.CompanyListing
import com.example.todamoon.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}