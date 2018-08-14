package com.qingmei2.rhine.di.module

import com.qingmei2.rhine.http.service.UserInfoService

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by QingMei on 2017/8/15.
 * desc:
 */
@Module
class ServiceModule {

    @Singleton
    @Provides
    internal fun provideUserInfoService(retrofit: Retrofit): UserInfoService {
        return retrofit.create(UserInfoService::class.java)
    }
}
