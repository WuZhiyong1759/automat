package com.pt.service;

import java.util.List;

import org.oasisopen.sca.annotation.Remotable;




import com.pt.domain.Stu;
@Remotable
public interface StuService  {
	public List<Stu> findBysstatue(int i);
}
