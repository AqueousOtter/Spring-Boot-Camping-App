import React from 'react'

export default function ReservationList() {
  return (
      <div className="reservation-list">
          {ReservationList.map(reservation => (
              <div key={reservation.id}>
                  

              </div> 
          
          ))}



      </div>

  )
}
