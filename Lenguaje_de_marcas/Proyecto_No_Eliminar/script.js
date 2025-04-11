const peliculas = [];

document.getElementById("peliculaForm").addEventListener("submit", function(e) {
  e.preventDefault();

  const id = parseInt(document.getElementById("id_pelicula").value);
  const titulo = document.getElementById("titulo").value.trim();
  const genero = document.getElementById("genero").value;
  const autor = document.getElementById("autor").value.trim();
  const año = parseInt(document.getElementById("año").value);
  const mensajeDiv = document.getElementById("mensaje");

  // Validación
  if (!id || !titulo || !genero || !autor || !año) {
    mensajeDiv.innerText = "❌ Todos los campos deben estar completos.";
    mensajeDiv.style.color = "red";
    return;
  }

  // Verificación de duplicado
  const existe = peliculas.some(p => p.id_pelicula === id);
  if (existe) {
    mensajeDiv.innerText = `❌ Ya existe una película con el ID ${id}.`;
    mensajeDiv.style.color = "red";
    return;
  }

  // Añadir película
  const pelicula = { id_pelicula: id, titulo, genero, autor, año };
  peliculas.push(pelicula);

  mensajeDiv.innerText = "✅ Película añadida correctamente.";
  mensajeDiv.style.color = "green";
  this.reset();
});

document.getElementById("mostrarPeliculasBtn").addEventListener("click", function() {
  const tablaDiv = document.getElementById("tablaPeliculas");
  tablaDiv.innerHTML = "";

  if (peliculas.length === 0) {
    tablaDiv.innerHTML = "<p>No hay películas registradas.</p>";
    return;
  }

  const tabla = document.createElement("table");
  const cabecera = `
    <tr>
      <th>ID</th>
      <th>Título</th>
      <th>Género</th>
      <th>Autor</th>
      <th>Año</th>
    </tr>
  `;
  tabla.innerHTML = cabecera;

  peliculas.forEach(p => {
    const fila = document.createElement("tr");
    fila.innerHTML = `
      <td>${p.id_pelicula}</td>
      <td>${p.titulo}</td>
      <td>${p.genero}</td>
      <td>${p.autor}</td>
      <td>${p.año}</td>
    `;
    tabla.appendChild(fila);
  });

  tablaDiv.appendChild(tabla);
});
