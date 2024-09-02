package com.hstn.internet_shop.repositories;

import com.hstn.internet_shop.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {



}
