package com.example.kotlinserverside.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

// @Repositoryアノテーションを付与することでItemRepositoryクラスをBeanとして登録する
@Repository
interface ItemRepository : CrudRepository<Item, Int>