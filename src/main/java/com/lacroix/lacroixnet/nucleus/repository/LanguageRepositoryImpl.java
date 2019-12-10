package com.lacroix.lacroixnet.nucleus.repository;
import com.lacroix.lacroixnet.nucleus.EntityManagerHolder;
import com.lacroix.lacroixnet.nucleus.entity.LanguageEntity;

import javax.persistence.EntityManager;

public class LanguageRepositoryImpl {

    public LanguageEntity getById(Long id){
        EntityManager entityManager =new EntityManagerHolder().getCurrentEntityManager();
        LanguageEntity languageEntity= entityManager.find(LanguageEntity.class, id);
        System.out.println("LanguageRepositoryImpl Read");
        return languageEntity;
    }
}
