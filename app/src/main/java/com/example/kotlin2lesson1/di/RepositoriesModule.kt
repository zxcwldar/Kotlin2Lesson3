package com.example.kotlin2lesson1.di

import com.example.kotlin2lesson1.data.remote.apiservice.MovieApiService
import com.example.kotlin2lesson1.data.repository.MovieRepositoryImpl
import com.example.kotlin2lesson1.domain.repositories.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module()
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {


    @Binds
    abstract fun provideMovieRepository(movieRepositoryImpl: MovieRepositoryImpl): MovieRepository

}