import React from 'react'
import { useState } from "react"
import './SearchBar.css'
import { useNavigate } from 'react-router-dom';

export default function SearchBar() {

    const [start, setStart] = useState("")
    const [end, setEnd] = useState("")
    const [guests, setGuests] = useState("")
    const navigate = useNavigate()
    const handleSubmit = (e) => {
        e.preventDefault()
        navigate(`/reserve?arrival=${start}&departure=${end}`)
    }

  return (
  <div className="home-reserve">
                  <div className="weather">
                    <img src="/assets/icons/sunny-icon.svg" alt="weather icon" />
                    <p>Curret weather</p>

                  </div>
                
                  <form onSubmit={handleSubmit}>
                    <label className='home-reserve-label'>
                      <p>check in:</p>
            
                      <input type="date" id='start'  onChange={(e) => setStart(e.target.value)} required />
                    </label>
                    <label className='home-reserve-label'>
                      <p>check out:</p>
                      <input type="date" id='end'  onChange={(e) => setEnd(e.target.value)} required />
                    </label>
                    <label className='home-reserve-label'>
                      <p>guests:</p>
                      <input type="number" id='guests' onChange={(e) => setGuests(e.target.value)} required />
                    </label>
                    <button className=' btn btn-sm btn-success submit'>explore</button>
          
                  </form>
    </div>
  )
}
