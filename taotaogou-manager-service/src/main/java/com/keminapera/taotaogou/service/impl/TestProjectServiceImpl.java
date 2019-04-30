package com.keminapera.taotaogou.service.impl;

import com.keminapera.taotaogou.mapper.TestProject;
import com.keminapera.taotaogou.service.TestProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service层测试实现类
 *
 * @author KeminaPera
 */

@Service
public class TestProjectServiceImpl implements TestProjectService {
    @Autowired
    private TestProject testProject;
    @Override
    public String getDate() {
        return testProject.getDate();
    }
}
