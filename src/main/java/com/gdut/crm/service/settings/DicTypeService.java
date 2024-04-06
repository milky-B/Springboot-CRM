package com.gdut.crm.service.settings;

import com.gdut.crm.pojo.settings.DicType;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DicTypeService {
    List<DicType> selectAllDicType();
}
