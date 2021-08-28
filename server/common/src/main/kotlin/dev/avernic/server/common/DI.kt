package dev.avernic.server.common

import org.koin.core.Koin
import org.koin.core.component.KoinScopeComponent
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import org.koin.mp.KoinPlatformTools

typealias Scoped = KoinScopeComponent

val DI: Koin get() = KoinPlatformTools.defaultContext().get()

inline fun <reified T : Any> Any.get(
    qualifier: Qualifier? = null,
    noinline parameters: ParametersDefinition? = null
): T = when(this) {
    is Scoped -> scope.get(qualifier, parameters)
    else -> DI.get(qualifier, parameters)
}

inline fun <reified T : Any> Any.inject(
    qualifier: Qualifier? = null,
    mode: LazyThreadSafetyMode = KoinPlatformTools.defaultLazyMode(),
    noinline parameters: ParametersDefinition? = null
): Lazy<T> = lazy(mode) { get(qualifier, parameters) }