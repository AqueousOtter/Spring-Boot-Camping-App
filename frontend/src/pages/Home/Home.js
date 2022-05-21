import React from 'react'
import "./Home.css"
import About from '../About/About'
import Activities from '../Activities/Activities'
import Rates from '../Rates/Rates'
import Contact from '../Contact/Contact'

export default function Home() {
  //TODO: Insert weather api
  
  return (
    <div className="home-content">
      <div className='home'>
        <div className="home-reserve">
                  <div className="weather">
                    <img src="/assets/icons/sunny-icon.svg" alt="weather icon" />
                    <p>Curret weather</p>

                  </div>
                
                  <form action="">
                    <label className='home-reserve-label'>
                      <p>check in:</p>
            
                      <input type="date" id='check-in' />
                    </label>
                    <label className='home-reserve-label'>
                      <p>check out:</p>
                      <input type="date" id='check-out' />
                    </label>
                    <label className='home-reserve-label'>
                      <p>guests:</p>
                      <input type="number" id='guests' />
                    </label>
                    <button className='submit'>explore</button>
          
                  </form>
        </div>
        

        <div className="main-content">
        <h2>welcome to evergreen grove</h2>
        <p>enjoy fresh air and foresty hikes to Lake Michigan beaches </p>
      
        </div>
      </div>

        
        <div className="activities-page" id='activities'>
          <Activities />
        </div>
        <div id="about"className="about-page">
          <About />
        </div>

        <div className="rates-page" id='rates'>
          <Rates />
        </div>
        <div className="contact-page" id="contact">
          <Contact />
        </div>


    </div>
  )
}
