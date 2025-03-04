add_alumno = () => {
  console.log("add_alumno");

  fetch("http://localhost:8090/alumnos/add_alumno", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      "id_alumno": 100,
      "nombre": "Juan",
      "asignatura": "lenguaje marcas",
      "nota": 8.5,
    }),
  });
};
