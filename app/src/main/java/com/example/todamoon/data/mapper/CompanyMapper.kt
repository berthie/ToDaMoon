package com.example.todamoon.data.mapper

import com.example.todamoon.data.local.CompanyListingsEntity
import com.example.todamoon.data.remote.dto.CompanyInfoDto
import com.example.todamoon.domain.model.CompanyInfo
import com.example.todamoon.domain.model.CompanyListing

fun CompanyListingsEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingsEntity {
    return CompanyListingsEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: "",
    )
}