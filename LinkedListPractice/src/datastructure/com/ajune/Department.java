package datastructure.com.ajune;

@Entity
@Table("Department")
public class Department {

	@ManyToOne()
	@JoinColumn(name="id")
	@Autowired
	private Employee emp;
}
