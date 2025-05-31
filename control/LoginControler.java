package control;

public class LoginControler {
    
//Usuario
String[][] credenciales = {
    {"dataguite", "gatitos123"}, {"bsolorzano", "perro456"},{"cvaldez", "luna789"}, {"dquintero", "sol321"},
    {"eramirez", "estrella654"}, {"fmartinez", "clave000"}, {"gcastillo", "paz111"}, {"hlara", "fuego222"}, 
    {"iperez", "agua333"}, {"jzuniga", "nube444"}, {"kmendez", "tierra555"}
};

public boolean validacionDatos(String EUsuario, String EContrasenna) {
    for (int i = 0; i < credenciales.length; i++) {
        if (credenciales[i][0].equals(EUsuario) && credenciales[i][1].equals(EContrasenna)) {
            return true;
        }
    }
    return false;
}
}

