package com.example.todamoon.presentation.company_info

import com.example.todamoon.domain.model.CompanyInfo
import com.example.todamoon.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
