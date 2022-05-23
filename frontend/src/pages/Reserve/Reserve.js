import React, { useEffect, useState } from 'react'
import { useLocation } from 'react-router-dom'
import SearchBar from '../../components/SearchBar/SearchBar'
import { useFetch } from '../../hooks/useFetch'
import ReservationList from './ReservationList'
import './Reserve.css'

export default function Reserve() {
  
  const queryString = useLocation().search
  const queryParams = new URLSearchParams(queryString)
  const query = queryParams.get('s')//gets value passed from searchbar.js
  const url = "http://localhost:8090/reservations/available/" + query 
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
