package academy.digitallab.store.product.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "tbl_productos")
@AllArgsConstructor @NoArgsConstructor @Builder
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String description;
	private Double stock;
	private Double price;
	private String state;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreateAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private Category category;
	
}
