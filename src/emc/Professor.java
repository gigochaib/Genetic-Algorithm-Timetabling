package emc;

import java.util.ArrayList;



/**
 * Class Professor
 */
public class Professor {

  //
  // Fields
  //

  private String nome;
  /**
   * separados por vırgulas – das disciplinas que o professor esta apto a ministrar naquele  perıodo letivo 
   */
  private ArrayList<Disciplina> disciplinasMinistrar;  /**

   * disciplinasMinist: roll de disciplinas que o professor tem compentência para ministrar
   * horariosDisponiveis: horários disponiveis que o professor tem para ministrar aula    */

  private ArrayList<TimeSlots> horariosDisponiveis;
  /**
   * um numero natural maior que zero – que identifica de maneira unica o professor. Portanto não ha dois professores com o mesmo código 
   */
  private int codigo;
  
  //
  // Constructors
  //
  public Professor (int codigo, String nome, ArrayList<Disciplina> disciplinasMinistrar) {
	  this.codigo = codigo;
	  this.nome=nome;
	  this.disciplinasMinistrar = disciplinasMinistrar;
  };
 
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nome
   * @param newVar the new value of nome
   */
  private void setNome (String nome) {
    this.nome = nome;
  }

  /**
   * Get the value of nome
   * @return the value of nome
   */
  private String getNome () {
    return nome;
  }

  /**
   * Set the value of disciplinasMinist
   * separados por vırgulas – das disciplinas que o professor esta apto a ministrar
   * naquele  perıodo letivo 
   * @param newVar the new value of disciplinasMinist
   */
  private void setDisciplinasMinist (ArrayList<Disciplina> disciplinasMinist) {
    this.disciplinasMinistrar = disciplinasMinist;
  }

  /**
   * Get the value of disciplinasMinist
   * separados por vırgulas – das disciplinas que o professor esta apto a ministrar
   * naquele  perıodo letivo 
   * @return the value of disciplinasMinist
   */
  private ArrayList<Disciplina> getDisciplinasMinist () {
    return disciplinasMinistrar;
  }

  /**
   * Set the value of horariosDisponiveis
   * disciplinasMinist: roll de disciplinas que o professor tem compentência para
   * ministrar
   * horariosDisponiveis: horários disponiveis que o professor tem para ministrar
   * aula
   * @param newVar the new value of horariosDisponiveis
   */
  private void setHorariosDisponiveis (ArrayList<TimeSlots> horariosDisponiveis) {
    this.horariosDisponiveis = horariosDisponiveis;
  }

  /**
   * Get the value of horariosDisponiveis
   * disciplinasMinist: roll de disciplinas que o professor tem compentência para
   * ministrar
   * horariosDisponiveis: horários disponiveis que o professor tem para ministrar
   * aula
   * @return the value of horariosDisponiveis
   */
  private ArrayList<TimeSlots> getHorariosDisponiveis () {
    return horariosDisponiveis;
  }

  /**
   * Set the value of codigo
   * um numero natural maior que zero – que identifica de maneira unica o professor.
   * Portanto não ha dois professores com o mesmo código 
   * @param newVar the new value of codigo
   */
  private void setCodigo (int codigo) {
    this.codigo = codigo;
  }

  /**
   * Get the value of codigo
   * um numero natural maior que zero – que identifica de maneira unica o professor.
   * Portanto não ha dois professores com o mesmo código 
   * @return the value of codigo
   */
  private int getCodigo () {
    return codigo;
  }

  //
  // Other methods
  //

  /**
   * retorna quantas horas de aula o professor ministra
   * @return       Int
   */
  public int cargaHoraria()
  {
	return codigo;
  }


  /**
   * Retorna verdadeiro se o horario passado por parametro está livre para aquele
   * professor
   * @return       Boolean
   * @param        timeSlot
   */
  public Boolean isTimeSlotAvailable(String timeSlot)
  {
	  return true;
  }


}
