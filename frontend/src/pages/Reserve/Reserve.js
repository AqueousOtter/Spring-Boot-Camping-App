import React, { useEffect, useState } from 'react'
import { useFetch } from '../../hooks/useFetch'

export default function Reserve() {

  const {data: reservations, isPending, error} = useFetch('http://localhost:8090/reservations/available/2022-06-15/2022-06-18')
  console.log(reservations)

  useEffect(() => {


  }, [])

  return (
    <div>Reserve


    </div>
  )
}
