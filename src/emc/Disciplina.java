package emc;

import java.util.ArrayList;



/**
 * Class Disciplina
 */
public class Disciplina {

  //
  // Fields
  //

  /**
   * e o codigo – um numero natural maior que zero – que identifica de maneira  unica disciplina. Portanto nao ha´ duas disciplinas com o mesmo codigo; 
   */
  private int codigo;
  private int numDisciplina;
  /**
   * expressa a carga horaria semanal, em numero de horas, das aulas  teoricas  da disciplina. Se nao houver aulas teoricas, então deve valer 0 (zero);
   */
  private int cargaHorariaTeorica;
  private Professor professor;
  private ArrayList<Estudante> alunosMat;
  /**
   * e o codigo – um numero natural maior que zero – do curso ao qual a disciplina está vinculada. Uma  disciplina somente pode estar vinculada a um unico curso. 
   */
  private int codigoCurso;
  /**
   * é uma cadeia de caracteres que descreve o nome oficial da disciplina; 
   */
  private String descricao;
  /**
   * expressa a carga horaria semanal, em numero de horas, das aulas praticas da disciplina. Se nao houver aulas praticas, então deve valer 0 (zero); 
   */
  private int cargaHorariaPratica;
  /**
   * define qual o tipo de sala de aula é necessário para acomodar as aulas teóricas da disciplina 
   */
  private String tipoSalaPratica;
  
  //
  // Constructors
  //
  public Disciplina () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of codigo
   * e o codigo – um numero natural maior que zero – que identifica de maneira  unica
   * disciplina. Portanto nao ha´ duas disciplinas com o mesmo codigo; 
   * @param newVar the new value of codigo
   */
  private void setCodigo (int codigo) {
    this.codigo = codigo;
  }

  /**
   * Get the value of codigo
   * e o codigo – um numero natural maior que zero – que identifica de maneira  unica
   * disciplina. Portanto nao ha´ duas disciplinas com o mesmo codigo; 
   * @return the value of codigo
   */
  private int getCodigo () {
    return codigo;
  }

  /**
   * Set the value of numDisciplina
   * @param newVar the new value of numDisciplina
   */
  private void setNumDisciplina (int numDisciplina) {
    this.numDisciplina = numDisciplina;
  }

  /**
   * Get the value of numDisciplina
   * @return the value of numDisciplina
   */
  private int getNumDisciplina () {
    return numDisciplina;
  }

  /**
   * Set the value of cargaHorariaTeorica
   * expressa a carga horaria semanal, em numero de horas, das aulas  teoricas  da
   * disciplina. Se nao houver aulas teoricas, então deve valer 0 (zero);
   * @param newVar the new value of cargaHorariaTeorica
   */
  private void setCargaHorariaTeorica (int cargaHorariaTeorica) {
    this.cargaHorariaTeorica = cargaHorariaTeorica;
  }

  /**
   * Get the value of cargaHorariaTeorica
   * expressa a carga horaria semanal, em numero de horas, das aulas  teoricas  da
   * disciplina. Se nao houver aulas teoricas, então deve valer 0 (zero);
   * @return the value of cargaHorariaTeorica
   */
  private int getCargaHorariaTeorica () {
    return cargaHorariaTeorica;
  }

  /**
   * Set the value of professor
   * @param newVar the new value of professor
   */
  private void setProfessor (Professor professor) {
    this.professor = professor;
  }

  /**
   * Get the value of professor
   * @return the value of professor
   */
  private Professor getProfessor () {
    return professor;
  }

  /**
   * Set the value of alunosMat
   * @param newVar the new value of alunosMat
   */
  private void setAlunosMat (ArrayList<Estudante> alunosMat) {
    this.alunosMat = alunosMat;
  }

  /**
   * Get the value of alunosMat
   * @return the value of alunosMat
   */
  private ArrayList<Estudante> getAlunosMat () {
    return alunosMat;
  }

  /**
   * Set the value of codigoCurso
   * e o codigo – um numero natural maior que zero – do curso ao qual a disciplina
   * está vinculada. Uma  disciplina somente pode estar vinculada a um unico curso. 
   * @param newVar the new value of codigoCurso
   */
  private void setCodigoCurso (int codigoCurso) {
    this.codigoCurso = codigoCurso;
  }

  /**
   * Get the value of codigoCurso
   * e o codigo – um numero natural maior que zero – do curso ao qual a disciplina
   * está vinculada. Uma  disciplina somente pode estar vinculada a um unico curso. 
   * @return the value of codigoCurso
   */
  private int getCodigoCurso () {
    return codigoCurso;
  }

  /**
   * Set the value of descricao
   * é uma cadeia de caracteres que descreve o nome oficial da disciplina; 
   * @param newVar the new value of descricao
   */
  private void setDescricao (String descricao) {
    this.descricao = descricao;
  }

  /**
   * Get the value of descricao
   * é uma cadeia de caracteres que descreve o nome oficial da disciplina; 
   * @return the value of descricao
   */
  private String getDescricao () {
    return descricao;
  }

  /**
   * Set the value of cargaHorariaPratica
   * expressa a carga horaria semanal, em numero de horas, das aulas praticas da
   * disciplina. Se nao houver aulas praticas, então deve valer 0 (zero); 
   * @param newVar the new value of cargaHorariaPratica
   */
  private void setCargaHorariaPratica (int newVar) {
    cargaHorariaPratica = newVar;
  }

  /**
   * Get the value of cargaHorariaPratica
   * expressa a carga horaria semanal, em numero de horas, das aulas praticas da
   * disciplina. Se nao houver aulas praticas, então deve valer 0 (zero); 
   * @return the value of cargaHorariaPratica
   */
  private int getCargaHorariaPratica () {
    return cargaHorariaPratica;
  }

  /**
   * Set the value of tipoSalaPratica
   * define qual o tipo de sala de aula é necessário para acomodar as aulas teóricas
   * da disciplina 
   * @param newVar the new value of tipoSalaPratica
   */
  private void setTipoSalaPratica (String tipoSalaPratica) {
    this.tipoSalaPratica = tipoSalaPratica;
  }

  /**
   * Get the value of tipoSalaPratica
   * define qual o tipo de sala de aula é necessário para acomodar as aulas teóricas
   * da disciplina 
   * @return the value of tipoSalaPratica
   */
  private String getTipoSalaPratica () {
    return tipoSalaPratica;
  }

  //
  // Other methods
  //

}
