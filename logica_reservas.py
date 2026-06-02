def reservar(datos):
    # 1. Validar campos obligatorios
    if campos_incompletos(datos):
        return "Error: Campos requeridos faltantes"
    
    # 2. Verificar disponibilidad (Control de duplicados)
    if consultar_disponibilidad(datos.fecha, datos.hora, datos.mesa):
        # 3. Guardar reserva
        guardar_en_bd(datos)
        return "Reserva confirmada con éxito"
    else:
        # 4. Error por ocupación
        return "Error: La mesa ya está reservada en ese horario"