import React, { useEffect, useState } from 'react'
import { useFetch } from '../../hooks/useFetch'
import ReservationList from './ReservationList'

export default function Reserve() {

  const {data: reservations, isPending, error} = useFetch('http://localhost:8090/reservations/available/2022-06-15/2022-06-24')

  console.log(reservations)



  return (

    <div className='reservation-section'>
      <div className="reservation-content">
        {isPending && <div>Loading...</div>}
        {error && <div>{error}</div>}
        {reservations && <ReservationList reservations={reservations} />}

      </div>


    </div>
  )
}
