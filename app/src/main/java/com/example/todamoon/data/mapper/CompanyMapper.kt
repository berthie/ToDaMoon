package com.example.todamoon.data.mapper

import com.example.todamoon.data.local.CompanyListingsEntity
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