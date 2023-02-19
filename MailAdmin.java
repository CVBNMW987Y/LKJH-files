package com.tns.mail;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MailAdmin
{
	private Integer M_id;
	private String M_password;
	
	
	public MailAdmin() 
	{
		super();
	}
	
	public MailAdmin(Integer m_id, String m_password)
	{
		super();
		M_id = m_id;
		M_password = m_password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getM_id() {
		return M_id;
	}
	public void setM_id(Integer m_id) {
		M_id = m_id;
	}
	public String getM_password() {
		return M_password;
	}
	public void setM_password(String m_password)
	{
		M_password = m_password;
	}
	@Override
	public String toString()
	{
		return "Mail[Mail id:"+M_id+" Mail password"+M_password+"]";
	}
}
