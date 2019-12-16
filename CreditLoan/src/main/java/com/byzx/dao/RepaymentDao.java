package com.byzx.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.byzx.model.Repayment;



/**@文件名: RepaymentDao.java
 * @类功能说明: 还款表dao层
 * @作者: LiuKaiWem
 * @Email: 1519960668@qq.com
 * @日期: 2019年11月29日下午2:02:25
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: LiuKaiWem</li> 
 * 	 <li>日期: 2019年11月29日下午2:02:25</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface RepaymentDao {

	@Select("select * from repayment where repayment_id=#{id01}")
	public Repayment findById(@Param("id01") Integer repayment_id);
}
