package SqlMapDaoImpl;

import java.util.List;
import com.ibatis.dao.client.DaoManager;
import DaoInterface.PersonDaoInterface;
import Models.Person;

public class PersonSqlMapDao extends BaseSqlMapDao implements PersonDaoInterface
{

	public PersonSqlMapDao(DaoManager daoManager) 
	{
		super(daoManager);		
	}

	@Override
	public List<Person> getAllPerson() 
	{		
		return queryForList("selectAllPerson", null);
	}

	@Override
	public Person getPerson(int scn) 
	{		
		return (Person) queryForObject("selectPerson", scn);
	}

	@Override
	public void updatePerson(Person person) 
	{		
		update("updatePerson", person);
	}

	@Override
	public void deletePerson(Person person)
	{
		delete("deletePerson", person);
	}

}
