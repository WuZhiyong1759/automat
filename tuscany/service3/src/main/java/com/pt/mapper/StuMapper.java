package com.pt.mapper;

import com.pt.domain.Stu;
import java.util.List;

public interface StuMapper {
    List<Stu> findBysstatue(int statue);
}