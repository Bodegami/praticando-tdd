import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PilhaTest {
	
	private Pilha p;
	
	@BeforeEach
	public void inicializaPilha() {
		p = new Pilha(10);
	}

	@Test
	public void pilhaVazia() {
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());
	}
	
	@Test
	public void empilhaUmElemento() {
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
	}
	
	@Test
	public void empilhaEDesempilha() {
		p.empilha("primeiro");
		p.empilha("segundo");
		assertEquals(2, p.tamanho());
		assertEquals("segundo", p.topo());
		
		Object desempilhado = p.desempilha();
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
		assertEquals("segundo", desempilhado);
	}
}
