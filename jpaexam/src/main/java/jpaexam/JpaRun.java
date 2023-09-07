package jpaexam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaRun {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaexam");
		EntityManager em = emf.createEntityManager(); // 영속성 컨텍스트가 생성됨.

		EntityTransaction tx = em.getTransaction();

		tx.begin();

		try {

			// 1. 저장.

//			Product product = new Product(); // 엔티티 생성!!
////			product.setId(2L);
//			product.setName("note");
//			product.setPrice(5000); // 여기까지는 비영속 상태!!
//
//			System.out.println("persist()  실행 전!!");
//			em.persist(product); // 영속상태. 영속상태에 들어간다고 해서, DB에 바로 반영되는것은 아님.
//			System.out.println("persist()  실행 후!!");
//
//			

			// 2. 조회
//			System.out.println("find()  실행 전!!");
//			Product findProduct =	em.find(Product.class, 129L );
//			System.out.println("find()  실행 후!!");
//			System.out.println(findProduct);
//			
//			
//			System.out.println("find()  실행 전!!");
//			Product findProduct2 =	em.find(Product.class, 129L );
//			System.out.println("find()  실행 후!!");
//			System.out.println(findProduct2);
//			
//			if(findProduct == findProduct2)
//				System.out.println("같은 인스턴스입니다.");
//			
//			


			// 3. 수정
			Product updateProduct = em.find(Product.class, 129L);
			updateProduct.setName("aaaa");
			updateProduct.setPrice(50000);
			
			//다른일들이 진행!! 
			
			updateProduct.setName("new note");
			updateProduct.setPrice(2000);
			

			//4. 삭제 
			Product delProduct = em.find(Product.class, 129L);
			
			em.remove(delProduct);
			
			
			
			System.out.println("commit()  실행 전!!");
			tx.commit();
			System.out.println("commit()  실행 후!!");
			
			

		} catch (Exception e) {
			tx.rollback();
		}

	}
}
