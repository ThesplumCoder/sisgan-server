package com.uis.sisgan.persistence.entity;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Modela los bovinos que tiene un propietario de ganado.
 * 
 * @author Anderson Acuña (GitHub: ThesplumCoder).
 */
@Entity
@Table(name = "CATTLES")
public class Cattle {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "id_lot")
    private Lot lot;

    @Column(name= "birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name= "weight", nullable = false)
    private Integer weight;
    
    @Column(name = "height", nullable = false)
    private Integer height;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "breed", nullable = false)
    private String breed;
    
    /**
     * Retorna el identificador del bovino.
     * 
     * @return Número que identifica al bovino.
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * Retorna el lote en el que está el bovino.
     * 
     * @return Lote al que pertenece el bovino.
     */
    public Lot getLot() {
        return lot;
    }
    
    /**
     * Retorna la fecha de nacimiento del bovino.
     * 
     * @return Fecha de nacimiento del bovino.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    /**
     * Retorna el peso.
     * 
     * @return Peso del bovino en kilogramos.
     */
    public Integer getWeight() {
        return weight;
    }
    
    /**
     * Retorna la altura que posee el bovino.
     * 
     * @return Altura del bovino en centímetros.
     */
    public Integer getHeight() {
        return height;
    }
    
    /**
     * Retorna el sexo que es el bovino.
     * 
     * @return Si es macho retorna 'M', de lo contrario retorna 'F'.
     */
    public String getSex() {
        return sex;
    }
    
    /**
     * Retorna la raza del bovino.
     * 
     * @return Texto con la raza registrada.
     */
    public String getBreed() {
        return breed;
    }
    
    /**
     * Cambia el identificador del bovino. Si es nulo no lo asigna.
     * 
     * @param id Número para identificar el bovino.
     */
    public void setId(Integer id) {
        if (id != null) {
            this.id = id;
        }
    }
    
    /**
     * Cambia el lote al que pertenece el bovino.
     * 
     * @param lot Objeto con los datos del lote.
     */
    public void setLot(Lot lot) {
        this.lot = lot;
    }
    
    /**
     * Cambia la fecha de nacimiento del bovino. Esto no debería usarse ya que 
     * es un dato que se supone que no cambia en el tiempo.
     * 
     * @param birthDate Fecha de nacimiento del bovino.
     */
    public void setBirthDate(LocalDate birthDate) {
        if (birthDate != null) {
            this.birthDate = birthDate;
        }
    }
    
    /**
     * Cambia el peso del bovino. Si se pasa un nulo o un valor negativo no se 
     * asigna.
     * 
     * @param weight Peso del bovino.
     */
    public void setWeight(Integer weight) {
        if (weight != null && weight > 0) {
            this.weight = weight;
        }
    }
    
    /**
     * Cambia la altura del bovino. Si se pasa un valor nulo o un valor negativo 
     * no se asigna.
     * 
     * @param height Altura del bovino.
     */
    public void setHeigh(Integer height) {
        if (height != null && height > 0) {
            this.height = height;
        }
    }
    
    /**
     * Cambia el sexo del bovino. Si se pasa un valor nulo o un valor que no sea 
     * "M" para masculino, "F" para femenino; no se asignará. Este método no 
     * debería ser usado después de la creación del bovino, ya que, éste no 
     * cambia de sexo durante el crecimiento.
     * 
     * @param sex Texto que define el sexo del bovino, puede ser "M" o "F".
     */
    public void setSex(String sex) {
        if (sex != null) {
            sex = sex.toUpperCase();
            if (sex == "M" || sex == "F") {
                this.sex = sex;
            }
        }
    }
    
    /**
     * Cambia la raza del bovino. Si se pasa un nulo o una cadena vacía entonces 
     * no lo asignará. Este método no se debería usar después de la creación del 
     * bovino, pues éste no cambia de raza en el crecimiento.
     * 
     * @param breed Texto que define la raza del bovino.
     */
    public void setBreed(String breed) {
        if (breed != null) {
            if (!(breed.isBlank())) {
                this.breed = breed;
            }
        }
    }
}
