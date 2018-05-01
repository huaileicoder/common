package org.huailei.dao;

import java.util.List;

import org.huailei.bean.Dic;

public interface DicDao {
    List<Dic> select(Dic dic);
}