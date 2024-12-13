package com.hvk.universitylistapp.di

import org.koin.dsl.module

val homeModule = module {
    v { MainViewModel() }
}