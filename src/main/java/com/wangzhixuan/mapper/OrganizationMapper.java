package com.wangzhixuan.mapper;

import java.util.List;

import com.wangzhixuan.model.Organization;

public interface OrganizationMapper {
    int deleteOrganizationById(Long id);

    int insert(Organization organization);

    int insertSelective(Organization organization);

    Organization selectByPrimaryKey(Long id);

    int updateOrganization(Organization organization);

    int updateByPrimaryKey(Organization organization);

    List<Organization> findOrganizationAllByPidNull();

    List<Organization> findOrganizationAllByPid(Long pid);

    List<Organization> findOrganizationAll();

    Organization findOrganizationById(Long id);
}