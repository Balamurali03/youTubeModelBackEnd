package com.project.youTubeModel.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.youTubeModel.Entity.Address;

public interface AddressRepo extends JpaRepository<Address,Integer> {

}
