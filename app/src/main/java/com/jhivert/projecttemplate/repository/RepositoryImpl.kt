package com.jhivert.projecttemplate.repository

class RepositoryImpl(
    private val webServiceInterface: WebService,
    private val dataBaseInterface: DataBaseInterface
) : Repository {

}
