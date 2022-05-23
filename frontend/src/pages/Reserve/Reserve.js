import React, { useEffect, useState } from 'react'
import { useLocation } from 'react-router-dom'
import SearchBar from '../../components/SearchBar/SearchBar'
import { useFetch } from '../../hooks/useFetch'
import ReservationList from './ReservationList'
import './Reserve.css'

export default function Reserve() {
  
  const queryString = useLocation().search
  console.log(queryString)
  const arrival = new URLSearchParams(queryString).get('arrival')
  const departure = new URLSearchParams(queryString).get('departure')

  console.log('a'+arrival)

  console.log(departure)
  const query = arrival +'/' + departure
  console.log(departure)
  const url = "http://localhost:8090/reservations/available/" +query
  const {data: reservations, isPending, error} = useFetch(url)
  console.log(reservations)

  return (

    <div className='reservation-section'>
      <div className="reservation-content">
        <SearchBar />
        {isPending && <div>Loading...</div>}
        {error && <div>{error}</div>}

        {reservations && <ReservationList reservations={reservations} />}

      </div>



    </div>
  )
}
