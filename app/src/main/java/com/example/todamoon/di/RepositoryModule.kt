package com.example.todamoon.di

import com.example.todamoon.data.csv.CSVParser
import com.example.todamoon.data.csv.CompanyListingsParser
import com.example.todamoon.data.repository.StockRepositoryImpl
import com.example.todamoon.domain.model.CompanyListing
import com.example.todamoon.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>


    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}