package org.huailei.service.impl;

import java.util.List;
import javax.annotation.Resource;

import org.huailei.bean.Dic;
import org.huailei.dao.DicDao;
import org.huailei.service.DicService;
import org.springframework.stereotype.Service;

@Service
public class DicServiceImpl implements DicService {
    
    @Resource
    private DicDao dicDao;
    
    @Override
    public List<Dic> getListByType(String type) {
	Dic dic = new Dic();
	dic.setType(type);
	return dicDao.select(dic);
    }
}
