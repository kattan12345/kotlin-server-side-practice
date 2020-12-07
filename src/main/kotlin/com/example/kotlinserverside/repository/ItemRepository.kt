package com.example.kotlinserverside.repository

import com.example.kotlinserverside.entity.Item
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

// @Repositoryアノテーションを付与することでItemRepositoryクラスをBeanとして登録する
@Repository
// SpringDataのCrudRepositoryを継承したインタフェースを作成する
// CrudRepositoryの型引数にはエンティティクラスと、そのエンティティクラス内で@Idを付与したプロパティの型を渡す
interface ItemRepository : CrudRepository<Item, Int>