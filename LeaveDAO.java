package com.hexaware.ftp19.persistence;

import com.hexaware.ftp19.model.Employee;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

/**
 * The DAO class for leave_details.
 */
public interface LeaveDAO  {
  /**
   * return all the details of all the employees whose status is  pending.
   * @return the leave_details array
   */
  @SqlQuery("SELECT * FROM LEAVE_DETAILS WHERE LEV_STATUS='pending' and EMP_ID IN(SELECT EMP_ID FROM EMPLOYEE WHERE EMP_MANAGER_ID= :empManagerId)")
  @Mapper(LeaveMapper.class)
  Employee find(@Bind("empManagerId")int empManagerId );
  List<LeaveDetails> list();

  /**
  * close with no args is used to close the connection.
  */
   void close();
}
