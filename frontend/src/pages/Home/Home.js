import React from 'react'
import "./Home.css"
import About from '../About/About'
import Activities from '../Activities/Activities'
import Rates from '../Rates/Rates'
import Contact from '../Contact/Contact'
import SearchBar from '../../components/SearchBar/SearchBar'

export default function Home() {
  //TODO: Insert weather api
  
  return (
    <div className="home-content">
      <div className='home'>
        <SearchBar />
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
