package DaoInterface;

import java.util.List;
import Models.Person;

public interface PersonDaoInterface 
{
	public List<Person>getAllPerson();
	public Person getPerson(int scn);
	public void updatePerson(Person person);
	public void deletePerson(Person person);
}
