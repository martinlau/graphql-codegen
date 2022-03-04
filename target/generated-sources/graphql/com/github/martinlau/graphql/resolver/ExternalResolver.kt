package com.github.martinlau.graphql.resolver

import com.github.martinlau.graphql.model.*
import com.github.martinlau.graphql.*

/**
 * Resolver for External
 */
@javax.annotation.processing.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2022-03-04T17:18:28+1000"
)
interface ExternalResolver {

    fun age(com.github.martinlau.external.model.External: com.github.martinlau.external.model.External): Int

}
