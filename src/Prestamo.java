public class Prestamo {
    
    private String fecha_inicio, fecha_final, nombre_empleado;
    private float comisionporlibro;

    public Prestamo() {
        this.fecha_inicio = "";
        this.fecha_final = "";
        this.nombre_empleado = "";
        this.comisionporlibro =0;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public float getComisionporlibro() {
        return comisionporlibro;
    }

    public void setComisionporlibro(float comisionporlibro) {
        this.comisionporlibro = comisionporlibro;
    }
}
